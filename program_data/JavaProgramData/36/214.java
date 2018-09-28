package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int[] num1 = new int[52];
		int[] num2 = new int[52];
		char[] str3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int i;
		int j;
		int max;
		int min;
		int flag;
		int flag1;
		int flag2;
		int flag3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		max = str1.length();
		min = str2.length();
		if (max != min)
		{
			System.out.print("NO");
		}
		else if (max == min)
		{
			for (i = 0;i < 52;i++)
			{
				for (j = 0;j < max;j++)
				{
			if (str1.charAt(j) == str3[i])
			{
				num1[i]++;
			}
			if (str2.charAt(j) == str3[i])
			{
				num2[i]++;
			}
				}
			}

		for (i = 0;i < max;i++)
		{
			flag = 0;
			flag1 = 0;
			for (j = 0;j < min;j++)
			{
				if (str2.charAt(j) == str1.charAt(i))
				{
					flag = 1;
				}

			flag1 = 1;
			}
				if (flag == 0)
				{

					System.out.print("NO");
					return;
				}
		}

		for (i = 0;i < 52;i++)
		{
			flag2 = 0;
			flag3 = 0;
			if (num1[i] == num2[i])
			{
				flag2 = 1;
			}
			flag3 = 1;
			if (flag2 == 0)
			{
				System.out.print("NO");
				return;
			}
		}
		}
		if (flag1 == 1 && flag3 == 1)
		{
			System.out.print("YES");
		}

	}
}

