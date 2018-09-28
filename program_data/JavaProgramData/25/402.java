package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] num = new int[100];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
		str = tangible.StringFunctions.changeCharacter(str, 0, 2);
		num[0] = 2;
		while (N > 1)
		{
			N--;
			for (i = 0;i < 100;i++)
			{
				num[i] = num[i] * 2;
			}
			for (i = 0;i < 100;i++)
			{
				if (num[i] >= 10)
				{
					num[i] = num[i] - 10;
					num[i + 1]++;
				}
			}
		}
		int k = 99;
		while (num[k] == 0 && k > 0)
		{
			k--;
		}
		for (i = k;i >= 0;i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}






}

