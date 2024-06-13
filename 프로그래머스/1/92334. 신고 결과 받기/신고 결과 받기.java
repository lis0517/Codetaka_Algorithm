import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
       int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportedCountMap = new HashMap<>();
        
        // 초기화
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportedCountMap.put(id, 0);
        }
        
        // 신고 내역 처리
        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String reported = split[1];
            reportMap.get(reporter).add(reported);
        }
        
        // 신고 횟수 계산
        for (String id : id_list) {
            Set<String> reportedSet = reportMap.get(id);
            for (String reported : reportedSet) {
                reportedCountMap.put(reported, reportedCountMap.get(reported) + 1);
            }
        }
        
        // 메일 발송 횟수 계산
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            Set<String> reportedSet = reportMap.get(id);
            for (String reported : reportedSet) {
                if (reportedCountMap.get(reported) >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}