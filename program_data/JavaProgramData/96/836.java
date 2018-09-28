package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int t;
		int shang;
		int yu;
		int temp = 0;
		String mult1 = new String(new char[len]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mult1 = tempVar.charAt(0);
		}
		int len1 = mult1.length();
		int[] c1 = new int[len1];
		for (i = 0; i < len1; i++)
		{
		c1[i] = (int)mult1.charAt(i) - 48;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *result = (int *)malloc(sizeof(int)*(len1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int result = (int)malloc((Integer.SIZE / Byte.SIZE) * (len1));
		if ((len1 == 2 && c1[len1 - 2] == 1 && c1[len1 - 1] < 3) || len1 == 1)
		{
			System.out.print("0\n");
			if (len1 == 2)
			{
			System.out.printf("%d",c1[len1 - 1] + c1[len1 - 2] * 10);
			}
			else
			{
			System.out.printf("%d",c1[len1 - 1]);
			}
		}
		else
		{
			for (i = 0;i < len1 - 1;i++)
			{
				t = (c1[i] * 10 + c1[i + 1]);
				shang = t / 13;
				result[j] = shang;
				j++;
				yu = t % 13;
				c1[i + 1] = yu;

			}
			if (result[0] != 0)
			{
				for (i = 0;i < len1 - 1;i++)
				{
				System.out.printf("%d",result[i]);
				}
			}
			else
			{
				for (i = 1;i < len1 - 1;i++)
				{
				System.out.printf("%d",result[i]);
				}
			}
			System.out.print("\n");
			System.out.printf("%d",yu);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(result);
		return 0;
	}

}

