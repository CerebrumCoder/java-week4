public class GradeExam {
    /** Main method */
    public static void main(String args[]) {
      // Students' answers to the questions
      char[][] answers = {
        {'A', 'A', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'D', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
  
      // Key to the questions
      char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
  
      int highestCount = 0;
      
      String highestStudent = "";
      // Grade all answers
      for (int i = 0; i < answers.length; i++) {
        // Grade one student
        int correctCount = 0;
        
        for (int j = 0; j < answers[i].length; j++) {
          if (answers[i][j] == keys[j])
            correctCount++;
        }
        if (correctCount==highestCount)
          highestStudent += " " + i;
        if (correctCount>highestCount){
          highestStudent = "" + i;
          highestCount = correctCount;
        }
        
        System.out.println("Student " + i + "'s correct count is " +
          correctCount);
      }
  
      System.out.println("The highest score is " + highestCount);
      System.out.println("Student with the highest score are : " + highestStudent);
    }
  }
  