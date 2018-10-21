package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String word = new String(new char[300]);
		int[] num = new int[123];
		int l;
		int i = 0;
		int j = 97;
		int k = 0;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			l = word.length();
			for (j = 97;j < 123;j++)
			{

				for (i = 0;i < l;i++)
				{
					if (word.charAt(i) == j)
					{
						num[j]++;
					}
				}
			}
			for (j = 97;j < 123;j++)
			{
				if (num[j] == 0)
				{
					k++;
				}
			}
			if (k == 26)
			{
				System.out.print("No");
			}
			else
			{


			for (j = 97;j < 123;j++)
			{
				if (num[j] != 0)
				{
					System.out.printf("%c=%d\n",j,num[j]);
				}
			}
			}



	}
}

