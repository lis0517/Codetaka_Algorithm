import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] termInfo = term.split(" ");
            termMap.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }

        List<Integer> expiredIndexes = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            String collectDate = privacyInfo[0];
            String term = privacyInfo[1];

            if (isExpired(today, collectDate, termMap.get(term))) {
                expiredIndexes.add(i + 1);
            }
        }

        int[] result = new int[expiredIndexes.size()];
        for (int i = 0; i < expiredIndexes.size(); i++) {
            result[i] = expiredIndexes.get(i);
        }

        return result;
    }

    private boolean isExpired(String today, String collectDate, int validMonths) {
        String[] todayParts = today.split("\\.");
        String[] collectDateParts = collectDate.split("\\.");

        int todayYear = Integer.parseInt(todayParts[0]);
        int todayMonth = Integer.parseInt(todayParts[1]);
        int todayDay = Integer.parseInt(todayParts[2]);

        int collectYear = Integer.parseInt(collectDateParts[0]);
        int collectMonth = Integer.parseInt(collectDateParts[1]);
        int collectDay = Integer.parseInt(collectDateParts[2]);

        int expireYear = collectYear;
        int expireMonth = collectMonth + validMonths;
        int expireDay = collectDay - 1;

        if (expireDay == 0) {
            expireDay = 28;
            expireMonth--;
        }

        if (expireMonth > 12) {
            expireYear += expireMonth / 12;
            expireMonth %= 12;
            if (expireMonth == 0) {
                expireYear--;
                expireMonth = 12;
            }
        }

        if (expireYear < todayYear) {
            return true;
        } else if (expireYear == todayYear) {
            if (expireMonth < todayMonth) {
                return true;
            } else if (expireMonth == todayMonth) {
                return expireDay < todayDay;
            }
        }

        return false;
    }
}