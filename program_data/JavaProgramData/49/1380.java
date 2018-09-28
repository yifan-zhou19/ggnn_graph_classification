package <missing>;

public class GlobalMembers
{
	public static int judge(String a, int i, int k)
	{
	   int j = i + k;
		while (a[i].equals(a[j]) && i <= a.length() && j >= 0)
		{
			i++;
			j--;

		}
		if (i >= j)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String a = new String(new char[510]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE) * 510);
		a = new Scanner(System.in).nextLine();
											/*if(judge(a))
											printf("YES");
											else printf("NO");*/
		int i;
		int j;
		int k;
		for (k = 1;k < a.length();k++)
		{
			for (i = 0;i + k < a.length();i++)
			{

					if (judge(a, i, k) != 0)
					{
						for (j = i;j <= i + k;j++)
						{
							System.out.printf("%c",a.charAt(j));
						}
						System.out.print('\n');
					}

			}

		}

		return 0;
	}

}
