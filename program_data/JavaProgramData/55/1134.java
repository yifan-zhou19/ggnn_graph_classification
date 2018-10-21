package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int in;
		int out;
		int sum = 0;
		int num;
		int nnn;
		int i;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			in = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < 100;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c <= '9' && c >= '0')
			{
				a[i] = c - '0';
			}
			if (c <= 'z' && c >= 'a')
			{
				a[i] = c - 'a' + 10;
			}
			if (c <= 'Z' && c >= 'A')
			{
				a[i] = c - 'A' + 10;
			}
			if (c == ' ')
			{
				num = i;
				break;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			out = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < num;i++)
		{
			sum += a[i] * Math.pow(in,num - i - 1);
		}
		for (i = 0;i < 100;i++)
		{
			b[i] = sum % out;
			sum = (sum - b[i]) / out;
			if (sum == 0)
			{
				nnn = i + 1;
				break;
			}
		}
		for (i = nnn - 1;i >= 0;i--)
		{
			if (b[i] <= 9 && b[i] >= 0)
			{
				c = b[i] + '0';
			}
			if (b[i] > 9)
			{
				c = b[i] - 10 + 'A';
			}
			System.out.printf("%c",c);
		}
		return 0;
	}



}

