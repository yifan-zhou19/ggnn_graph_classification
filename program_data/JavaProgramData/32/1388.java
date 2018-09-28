package <missing>;

public class GlobalMembers
{
	//**********************************
	//??: ?????
	//???2013.11.16
	//**********************************
	public static int sub(int len, int[] an1, int[] an2)
	{
		int max = 0;
		for (int i = 0;i <= len;i++)
		{
			an1[i] = an1[i] - an2[i];
			if (an1[i] < 0)
			{
				an1[i] = an1[i] + 10;
				an1[i + 1] = an1[i + 1] - 1;
			}
			if (an1[i] != 0)
			{
				max = i;
			}
		}
		return (max);
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			String bn1 = new String(new char[102]);
			String bn2 = new String(new char[102]);
			int j = 0;
			int k = 0;
			int max = 0;
			int[] an1 = new int[102];
			int[] an2 = new int[102];
			bn1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			bn2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an2,0,(Integer.SIZE / Byte.SIZE));
			for (j = bn1.length() - 1,k = 0;j >= 0;j--)
			{
				an1[k++] = bn1.charAt(j) - '0';
			}
			for (j = bn2.length() - 1,k = 0;j >= 0;j--)
			{
				an2[k++] = bn2.charAt(j) - '0';
			}
			 max = sub(bn1.length(), an1, an2);
			 for (j = max;j >= 0;j--)
			 {
				 System.out.print(an1[j]);
			 }
			 System.out.print("\n");
		}
		return 0;
	}
}

