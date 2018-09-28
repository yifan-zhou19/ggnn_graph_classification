package <missing>;

public class GlobalMembers
{
	public static String minus(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		String c;
		int m;
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		m = a.argValue.length();
		n = b.argValue.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc((Character.SIZE / Byte.SIZE) * N);
		k = N - 1;
		c = c.substring(0, k);
		k--;
		i = m - 1;
		for (j = n - 1;j >= 0;j--)
		{
			if (a.argValue.charAt(i) >= b.argValue.charAt(j))
			{
				c = tangible.StringFunctions.changeCharacter(c, k, a.argValue.charAt(i) - b.argValue.charAt(j) + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, k, a.argValue.charAt(i) - b.argValue.charAt(j) + 10 + '0');
				a.argValue.charAt(i - 1) = a.argValue.charAt(i - 1) - 1;
			}
			k--;
			i--;
		}
		while (i >= 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, k, a.argValue.charAt(i));
			k--;
			i--;
		}
		return c.Substring(k) + 1;

	}

	public static void Main()
	{
		String[] s1;
		String[] s2;
		String[] s3;
		int n = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s1 = (String)malloc(sizeof(String) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s2 = (String)malloc(sizeof(String) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s3 = (String)malloc(sizeof(String) * n);
		while (i < n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s1[i] = (String)malloc((Character.SIZE / Byte.SIZE) * N);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s2[i] = (String)malloc((Character.SIZE / Byte.SIZE) * N);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[i] = tempVar3.charAt(0);
			}
			System.out.print("\n");
			s3[i] = minus(s1[i], s2[i]);
			i++;
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(s3[i]);
		}

	}
}

