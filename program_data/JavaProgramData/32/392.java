package <missing>;

public class GlobalMembers
{
	public static String jian(tangible.RefObject<String> x, tangible.RefObject<String> y, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String p3;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc((m) * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc((m) * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p3 = (String)malloc((m) * (Character.SIZE / Byte.SIZE));
		p1 = x.argValue;
		p2 = y.argValue;
		p1 = p1 + m - 1;
		 p2 = p2 + n - 1;
		int t = m - 1;
		while (((*p1) >= '0' - 1) && ((*p1) <= '9'))
		{
			if ((*p1) < (*p2))
			{
				p3 = tangible.StringFunctions.changeCharacter(p3, t, (*p1) - (*p2) + 10 + '0');
				p1--;
				*p1 = p1 - '1' + '0';
				p2--;
			}
			else if (((*p1) >= (*p2)) && ((*p2) >= '0') && ((*p2) <= '9'))
			{
				p3 = tangible.StringFunctions.changeCharacter(p3, t, (*p1) - (*p2) + '0');
				p1--;
				p2--;
			}
			else
			{
				p3 = tangible.StringFunctions.changeCharacter(p3, t, (*p1));
				p1--;
				//p2 --;
			}
			t--;
		}
		return (p3);

	}

	public static void Main()
	{
		int s;
		int i;
		int j;
		int k;
		String[] a = new String[10];
		String[] b = new String[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 0; i < s; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b[i] = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		}
		for (i = 0; i < s; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0; i < s; i++)
		{
			for (j = 0; j < String.valueOf(a[i]).length(); j++)
			{
			if (jian(a[i], b[i], String.valueOf(a[i]).length(), String.valueOf(b[i]).length()).charAt(j) != '0')
			{
				k = j;
				break;
			}
			}
			for (j = k; j < String.valueOf(a[i]).length(); j++)
			{
				System.out.printf("%c", jian(a[i], b[i], String.valueOf(a[i]).length(), String.valueOf(b[i]).length()).charAt(j));
			}
			System.out.print("\n");
		}

	}
}

