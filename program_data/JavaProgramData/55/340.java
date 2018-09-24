package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[100];
	public static int a;
	public static int b;

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int atoten(char *p)
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int atoten(char * p)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int s=0;
		int s = 0;
		int len;
		int i;

		len = p.length();

		p = p.Substring(len) - 1;

		for (i = 0;i < len;i++,p--)
		{
			if (*p >= '0' && *p <= '9')
			{
			s = s + (*p - '0') * Math.pow(a,i);
			}
			else if (*p >= 'a' && *p <= 'z')
			{
				s = s + (*p - 'a' + 10) * Math.pow(a,i);
			}
			else
			{
				s = s + (*p - 'A' + 10) * Math.pow(a,i);
			}

		}

		return s;

	}


	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: int tentob(unsigned long int s)
	public static int tentob(int s)
	{
		int i;
		int k;

		for (i = 0;s != 0;i++)
		{
			t[i] = s % b;
			s = s / b;
		}
		k = i - 1;
		return k;

	}

	public static void print(int k)
	{
		int i;

		if (k < 0)
		{
			System.out.print("0");
		}

		for (i = k;i >= 0;i--)
		{
			if (t[i] > 9)
			{
				t[i] += 'A' - 10;
				System.out.printf("%c",t[i]);
			}
			else
			{
				System.out.printf("%d",t[i]);
			}

		}

	}

	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int s;
		int s;
		final String n = "";
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}


		s = atoten(n);
		k = tentob(s);
		print(k);


	}
}

