class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

//        n은 사람수, words는 단어 배열
//        정답 [n번째 사람,차례]

//        단어의 길이는 2 이상 50 이하
        for(int i = 1; i < words.length;i++){

            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)){
                int cycle = (i+1)%n==0?(i+1)/n:(i+1)/n+1;
                int person = (i+1)%n==0?n:(i+1)%n;
                answer[0] = person;
                answer[1] = cycle;

                System.out.println("끝말잇기 틀림 " + i);
                break;
            }

            for(int j = 0 ; j < i;j++){
                if(words[i].equals(words[j])){
                    int cycle = (i+1)%n==0?(i+1)/n:(i+1)/n+1;
                    int person = (i+1)%n==0?n:(i+1)%n;


                    answer[0] = person;
                    answer[1] = cycle;
                    System.out.println("중복단어 " + i);
                    break;
                }
            }

            if(answer[0] !=0)
                break;

        }



        return answer;
    }
}
