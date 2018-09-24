package <missing>;

public class GlobalMembers
{
	public static void add(tangible.RefObject<String> a, tangible.RefObject<String> b, tangible.RefObject<String> c)
	{
		int i;
		int j;
		int k;
		int max;
		int min;
		int n;
		int temp;
		String s;
		String pmax;
		String pmin;
		max = a.argValue.length();
		min = b.argValue.length();
		if (max < min)
		{
			temp = max;
			max = min;
			min = temp;
			pmax = b.argValue;
			pmin = a.argValue;
		}
		else
		{
			pmax = a.argValue;
			pmin = b.argValue;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   s = (String)malloc((Character.SIZE / Byte.SIZE) * (max + 1));
		  s.charAt(0) = '0';
		   for (i = min - 1,j = max - 1,k = max;i >= 0;i--,j--,k--)
		   {
			s.charAt(k) = pmin.charAt(i) - '0' + pmax.charAt(j);
		   }
		   for (;j >= 0;j--,k--)
		   {
			  s.charAt(k) = pmax.charAt(j);
		   }
		   for (i = max;i >= 0;i--)
		   {
			if (s.charAt(i) > '9')
			{
				s.charAt(i) -= 10;
				s.charAt(i - 1)++;
			}
		   }
			if (s.charAt(0) == '0')
			{
				for (i = 1;i < max + 1;i++)
				{
				c.argValue.charAt(i - 1) = s.charAt(i);
				}
				c.argValue.charAt(i - 1) = '\0';
			}
			else
			{
				for (i = 0;i < max + 1;i++)
				{
				  c.argValue.charAt(i) = s.charAt(i);
				}
				  c.argValue.charAt(i) = '\0';

			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(s);

	}

	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if ((a.charAt(0) == '0') && (a.charAt(1) == '\0') && (b.charAt(1) == '\0') && (b.charAt(0) == '0'))
		{
			System.out.print("0");
		}
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		add(tempRef_a, tempRef_b, tempRef_c);
		c = tempRef_c.argValue;
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		p = c;
		if ((*p == '0') && (*(p++) != '0') && (c.length() > 1))
		{
			p++;
		}
		for (p1 = p;p1 < c + c.length();p1++)
		{
		System.out.printf("%c",*p1);
		}
		return 0;
	}
}

