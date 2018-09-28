package <missing>;

public class GlobalMembers
{
	public static void minus(tangible.RefObject<String> a, tangible.RefObject<String> b, int na, int nb, tangible.RefObject<String> c)
	{
		int i;
		for (i = 0;i < nb;i++)
		{
		   if ((a.argValue.charAt(i) - b.argValue.charAt(i)) < 0)
		   {
			   c.argValue.charAt(i) = 10 + a.argValue.charAt(i) - b.argValue.charAt(i) + '0';
			   a.argValue.charAt(i + 1)--;
		   }
		   else
		   {
			   c.argValue.charAt(i) = a.argValue.charAt(i) - b.argValue.charAt(i) + '0';
		   }

		}
	   for (i = nb;i < na - 1;i++)
	   {
		   if (a.argValue.charAt(i) < '0')
		   {
			   a.argValue.charAt(i) = a.argValue.charAt(i) + 10;
			   a.argValue.charAt(i + 1)--;
		   }
		   c.argValue.charAt(i) = a.argValue.charAt(i);
	   }
	   c.argValue.charAt(na - 1) = a.argValue.charAt(na - 1);
	}
	public static void exchange(tangible.RefObject<String> a, int na)
	{
	 int k;
	 for (k = 1;k <= (na / 2);k++)
	 {
				int t;
				t = a.argValue.charAt(k - 1);
				a.argValue.charAt(k - 1) = a.argValue.charAt(na - k);
				a.argValue.charAt(na - k) = t;
	 }
	}
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String[] c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		c = (String)malloc((n + 1) * sizeof(String));
		if (c != null)
		{
			String a = new String(new char[100]);
			String b = new String(new char[100]);
		int na;
		int nb;
		for (i = 0;i < n;i++)
		{
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
			na = a.length();
			nb = b.length();
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			exchange(tempRef_a, na);
			a = tempRef_a.argValue;
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			exchange(tempRef_b, nb);
			b = tempRef_b.argValue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			c[i] = (String)malloc((na + 1) * (Character.SIZE / Byte.SIZE));
			if (c[i] != null)
			{
		tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
			minus(tempRef_a2, tempRef_b2, na, nb, c[i]);
			b = tempRef_b2.argValue;
			a = tempRef_a2.argValue;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = String.valueOf(c[i]).length() - 1;k > 0;k--)
			{
			 if (c[i][k] > '0')
			 {
				 break;
			 }
			}
			for (j = k;j >= 0;j--)
			{
				System.out.printf("%c",c[i][j]);
				if (j == 0)
				{
					System.out.print("\n");
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(c[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
		}
	}

}

