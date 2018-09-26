package <missing>;

public class GlobalMembers
{
	public static int power(int a,int i)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long j,k=1;
		int j;
		int k = 1;
		for (j = 0;j < i;j++)
		{
			k = k * a;
		}
		return (k);
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int l;
		int t;
		int y;
		int k;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long temp=0,x;
		int temp = 0;
		int x;
		char[] p = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] re = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = p.length();
		for (i = 0;i < l;i++)
		{
			if (p[l - 1 - i] >= 'a' && p[l - 1 - i] <= 'z')
			{
			   temp += (p[l - 1 - i] - 'a' + 10) * power(a, i);
			}
			if (p[l - 1 - i] >= 'A' && p[l - 1 - i] <= 'Z')
			{
			   temp += (p[l - 1 - i] - 'A' + 10) * power(a, i);
			}
			if (p[l - 1 - i] >= '0' && p[l - 1 - i] <= '9')
			{
			   temp += (p[l - 1 - i] - '0') * power(a, i);
			}
		}
		for (j = 0;;j++)
		{
			x = power(b, j);
			y = temp / x;
			if (y < b)
			{
				break;
			}
		}
		j++;
		for (k = j - 1;k >= 0;k--)
		{
			x = power(b, k);
			t = temp / x;
			if (t >= 10)
			{
				re[j - 1 - k] = 'A' + t - 10;
			}
			else
			{
				re[j - 1 - k] = '0' + t;
			}
			temp -= x * t;
		}
		System.out.printf("%s",re);
		return (0);
	}

}

