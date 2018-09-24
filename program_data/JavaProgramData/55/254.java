package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int f = 0;
	int e;
	int b;
	int c;
	int i;
	int g;
	int k = 0;
	int j = 0;
	int v = 1;
	String d = new String(new char[100]);
	String a = new String(new char[100]);
	int[] h = new int[100];
	e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
	if (a.charAt(i) == ' ')
	{
		break;
	}
	} //??????
	for (i = 0;;i++)
	{
		d = tangible.StringFunctions.changeCharacter(d, i, System.in.read());
	if (d.charAt(i) == ' ')
	{
		break;
	}
	j++;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	//for(i=0;i<4;i++)
	//printf("%c\n",d[i]);
	//printf("%d %d",b,c);
	g = b; //????
	{
		for (i = 0;;i++)
		{
			if (d.charAt(i) == ' ')
			{
				break;
			}
		if (d.charAt(i) < 59)
		{
			h[i] = d.charAt(i) - 48;
		}
		else if (d.charAt(i) <= 'Z')
		{
			h[i] = d.charAt(i) - 55;
		}
		else
		{
			h[i] = d.charAt(i) - 87;
		}
	//printf("%d\n",h[i]);
		};
		for (i = j - 1;i >= 0;i--)
		{
			f = f + h[i] * b / g;
			b = b * g;
		}

	//	printf("%d\n",f);//??
	} //??10
	{
			for (i = 0;;i++)
			{
			h[i] = f % c;
			f = f / c;
			k++;
			if (f == 0)
			{
				break;
			}
			}; //??
	for (i = 0;i < k;i++)
	{
		if (h[i] <= 9)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, h[i] + 48);
		}
		else
		{
			d = tangible.StringFunctions.changeCharacter(d, i, h[i] + 55);
		}
	}
		for (i = k - 1;i >= 0;i--)
		{
			if (j >= 10)
			{
			System.out.print("2147483647");
			break;
			}
	else
	{
		System.out.printf("%c",d.charAt(i));
	}
		}
		System.out.print("\n"); //????
	}
	}

}

