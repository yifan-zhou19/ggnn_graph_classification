package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int len;
		int temp;
		int num;
		String a = new String(new char[50]);
		num = 0;
		temp = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i && i % j != 0;j++)
			{
				;
			}
			if (j == i)
			{
				len = (int)Math.log10(i) + 1;
			for (k = 0;k < len;k++)
			{
			a = tangible.StringFunctions.changeCharacter(a, k, (i % (int)Math.pow(10,k + 1)) / (int)Math.pow(10,k));
			}
			for (k = 0;k < len && a.charAt(k) == a.charAt(len - 1 - k);k++)
			{
				;
			}
			if (k == len)
			{
				System.out.printf("%ld",i);
				num = num + 1;
				temp = i;
				break;
			}
			}
		}
		 if (temp == 0)
		 {
			 System.out.print("no");
		 }
			if (temp < n && temp != 0)
			{
				for (i = temp + 1;i <= n;i++)
				{
			for (j = 2;j < i && i % j != 0;j++)
			{
				;
			}
			if (j == i)
			{
				len = (int)Math.log10(i) + 1;
			for (k = 0;k <= len;k++)
			{
			a = tangible.StringFunctions.changeCharacter(a, k, (i % (int)Math.pow(10,k + 1)) / (int)Math.pow(10,k));
			}
			for (k = 0;k < len && a.charAt(k) == a.charAt(len - 1 - k);k++)
			{
				;
			}
			if (k == len)
			{
				System.out.printf(",%ld",i);
				num = num + 1;
			}
			}
				}
			}

	}
}

