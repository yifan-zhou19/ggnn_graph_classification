package <missing>;

public class GlobalMembers
{
	public static void Reverse(String y)
	{
		int len = y.length();
		int i;
		for (i = 0;i < len / 2;i++)
		{
			char tmp = y[i];
			y[i] = y[len - i - 1];
			y[len - i - 1] = tmp;
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int n;
		int s = 0;
		int a1 = 1;
		int l;
		int r;
		int i;
		int j;
		String x = new String(new char[100]);
		String y = new String(new char[1000]);
		char m;
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
		n = x.length();
		for (i = 0;i < n;i++)
		{
			if (x.charAt(n - 1 - i) < 58)
			{
				r = x.charAt(n - 1 - i) - 48;
			}
			else
			{
				if ((x.charAt(n - 1 - i) >= 'a') && (x.charAt(n - i - 1) <= 'z'))
				{
					r = x.charAt(n - 1 - i) - 87;
				}
				else
				{
					r = x.charAt(n - 1 - i) - 55;
				}
			}
			s = s + r * a1;
			a1 = a1 * a;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y,0,(Character.SIZE / Byte.SIZE));
		for (i = 0,l = s;;i++)
		{
			r = l % b;
			l = (l) / b;

			if (r < 10)
			{
				y = tangible.StringFunctions.changeCharacter(y, i, r + 48);
			}
			else
			{
				y = tangible.StringFunctions.changeCharacter(y, i, r + 55);
			}
			if (l == 0)
			{
				break;
			}
		}
		Reverse(y);
		System.out.printf("%s\n",y);
		//for(j=i;j>=0;j--)
		//{
		//	printf("%c",y[j]);
		//}
		//printf("\n");
		return 0;
	}
}

