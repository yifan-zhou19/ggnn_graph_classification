package <missing>;

public class GlobalMembers
{
	/*
	 * zhizhen3.cpp
	 *??????
	 *  Created on: 2011-12-5
	 *      Author: APPLE
	 */
	public static int Main() //?????
	{
		 int n;
		 int csum = 0;
		 int j = 0;
		 int i = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 char[][] words = new char[1000][20]; //????????????
		 for (i = 0;i < n;i++)
		 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 words[i] = tempVar.charAt(0);
		 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 csum = csum + String.valueOf(words[i]).length() + 1; //?csum??????????+1???????
			if (csum == 81) //?????80?????  ??????????
			{
			  System.out.print(words[j]);
			   for (j = j + 1;j <= i;j++)
			   {
				System.out.print(' ');
				System.out.print(words[j]);
			   }
					csum = 0; //?csum????
					 System.out.print("\n");
				continue;
			}

			 if (csum > 81) //????80????? ??????????
			 {
			 System.out.print(words[j]);
			for (j = j + 1;j < i;j++)
			{
			  System.out.print(' ');
			  System.out.print(words[j]);
			}
			csum = String.valueOf(words[i]).length() + 1; //?csum????
			System.out.print("\n");
			continue;
			 }
		 }
		 System.out.print(words[j]);
					   for (j = j + 1;j < n;j++)
					   {
						   System.out.print(' ');
						   System.out.print(words[j]);
					   }
			return 0; //?????

	}

}

