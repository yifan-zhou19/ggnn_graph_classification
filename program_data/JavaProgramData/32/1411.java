package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int times;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			times = Integer.parseInt(tempVar);
		}
		int flow;
		for (flow = 0;flow < times;flow++)
		{
			String a = new String(new char[260]);
			String b = new String(new char[260]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}

			char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			int[] numa = new int[260];
			int[] numb = new int[260];
			int[] c = new int[260];

			int i;
			int j;
			int lena;
			int lenb;
			lena = a.length();
			lenb = b.length();

			int k = 0;
			for (i = lena - 1;i >= 0;i--)
			{
				for (j = 0;j < 10;j++)
				{
					if (a.charAt(i) == num[j])
					{
						numa[k] = j; //???a(1234567)?????(7654321)
					}
				}
				k++;
			}
			k = 0; //???!!
			for (i = lenb - 1;i >= 0;i--)
			{
				for (j = 0;j < 10;j++)
				{
					if (b.charAt(i) == num[j])
					{
						numb[k] = j; //???b(12345)?????(54321)
					}
				}
				k++;
			}
			for (i = 0;i < max(lena, lenb);i++)
			{
				if (numa[i] - numb[i] >= 0)
				{
					c[i] = numa[i] - numb[i]; //??????,??c
				}
				else
				{
					c[i] = numa[i] - numb[i] + 10;
					if (numa[i + 1] > 0)
					{
						numa[i + 1] = numa[i + 1] - 1;
					}
					else
					{
						numa[i + 1] = 9;
						numa[i + 2] = numa[i + 2] - 1;
					}
				}
			}
			int M;
			for (i = max(lena, lenb);i >= 0;i--)
			{
				if (c[i] != 0)
				{
					M = i;
					break;
				}
			}
			for (i = M;i >= 0;i--)
			{
				System.out.printf("%d",c[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

