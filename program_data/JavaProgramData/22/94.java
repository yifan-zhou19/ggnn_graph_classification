package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[2000]);
		int num = 0;
		int i;
		int j;
		int temp1;
		int temp2;
		int len;
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < 300;i++)
		{
			b[i] = 0;
		}
		for (i = 0,j = 0;i < len;i++)
		{
			if (s.charAt(i) != ',')
			{
				b[j] = b[j] * 10 + s.charAt(i) - '0';
			}
			if (s.charAt(i) == ',')
			{
				j++;
			}
		}
		num = j + 1;
		if (num == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i < num && b[0] == b[i];i++)
		{
			;
		}
		if (i == num)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0,temp1 = b[0];i < num;i++)
			{
				if (temp1 < b[i])
				{
					temp1 = b[i];
				}
			}
			for (i = 0,temp2 = b[0];i < num;i++)
			{
				if (temp2 > b[i])
				{
					temp2 = b[i];
				}
			}
			for (i = 0;i < num;i++)
			{
				if (b[i] < temp1 && temp2 < b[i])
				{
					temp2 = b[i];
				}
			}
			System.out.printf("%d",temp2);
		}
		}

	}

}

