package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int k;
		int i;
		int q;
		int f = 0;
		String x = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = x;
		int n = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = x.length() - 1;
		for (;k >= 0;k--,p++)
		{
			if (*p >= 48 && *p <= 57)
			{
				t = (int) * p - 48;
			}
			else if (*p >= 65 && *p <= 90)
			{
				t = (int) * p - 55;
			}
			else if (*p >= 97 && *p <= 122)
			{
				t = (int) * p - 87;
			}
			i = k;
			while (i > 0)
			{
				t = t * a;
				i--;
			}
			n += t;
		}
		for (t = n,i = 0;t >= b;i++)
		{
			t = t / b;
		}
		for (k = i,t = 1;k >= 0;k--,t = 1)
		{
			i = k;
			while (i > 0)
			{
				t = t * b;
				i--;
			}
			q = n / t;
			if (q == 0 && f == 0)
			{
				continue;
			}
			else if (f == 0)
			{
				f = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto z;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	z:
	if (q >= 0 && q <= 9)
	{
					System.out.printf("%d",q);
	}
				else if (q >= 10)
				{
					System.out.printf("%c",q + 55);
				}
				n = n - q * t;
			}
		}
		if (f == 0)
		{
			System.out.print("0");
		}
	}

}

