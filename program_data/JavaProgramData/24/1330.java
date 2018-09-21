package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		int[] num = new int[1000];
		char[][] word1 = new char[50][100];
		word = new Scanner(System.in).nextLine();
		int i;
		int count = 0;
		int flag = 0;
		int max = 0;
		int min = 100;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		for (i = 0;i <= word.length();i++)
		{
								   if (word.charAt(i) != ' ' && word.charAt(i) != '\0')
								   {
												 count++;
												 word1[flag1][flag2] = word.charAt(i);
												 flag2++;
								   }
								   else
								   {

										if (count > max)
										{
										max = count; //printf("%d\n",max);
										}
										if (count < min)
										{
										min = count;
										}
										count = 0;
										flag1++;
										flag2 = 0;
								   }
		}
		//printf("%d",max);
		//getchar();getchar();
		//return 0;
		count = 0;
		for (i = 0;i < flag1 + 1;i++)
		{
							if (max == String.valueOf(word1[i]).length())
							{
													 System.out.printf("%s\n",word1[i]);
													 break;
							}
		}
		for (i = 0;i < flag1 + 1;i++)
		{
							if (min == String.valueOf(word1[i]).length())
							{
													 System.out.printf("%s",word1[i]);
													 break;
							}
		}
		System.in.read();
		System.in.read();
		return 0;
	}






}
