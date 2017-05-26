/**
 * @Project : spring-boot-cassandra-4
 * @Package : example.logics
 * @fileName: NumberRepetition.java
 * @Date    : May 26, 2017
 * @author  : justin */
package example.logics;

/**
 * @author justin 
 *Capgemini interview question.
 */
public class NumberRepetition {

	public static void main(String[] args) {
	
		int[] dupes={1,1,4,4,2,2,10,3,3,1,6,3,5,9,8,7,9,6,4};

		fndDupe(dupes);
	}
	
	public static int[]fndDupe(int []inputs)
	{
		int[]dupesCount=new int[11];
		for(int i=0;i<inputs.length;i++)
		{
		dupesCount[inputs[i]]++;
		}
		
		for(int i=1;i<dupesCount.length;i++)
		{
			System.out.println(i+" Repeated "+dupesCount[i]+" Times");
		}
		return dupesCount;
	}
	
}
