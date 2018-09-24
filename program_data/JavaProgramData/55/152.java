package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[3]);
		String b = new String(new char[100]);
		String c = new String(new char[3]);
		String after = new String(new char[100]);
		char strtmp;
		String after1 = new String(new char[100]);
		int before = 0;
		int n1;
		int n2;
		int i;
		int n;
		int[] A = new int[100];
		int tmp;
		int m;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(c);
		n = b.length();
		//printf ("%d\n%d\n",n1,n2);
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			if (b.charAt(i) >= '0' && b.charAt(i) <= '9')
			{
				A[i] = b.charAt(i) - 48;
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				A[i] = b.charAt(i) - 55;
			}
			//printf ("%d\n",A[i]);
		}

		for (i = 0;i < n;i++)
		{
			 before = before * n1 + A[i];
		} //printf ("%d\n",before);
		if (before == 0)
		{
			after1 = tangible.StringFunctions.changeCharacter(after1, 0, '0');
			after1 = tangible.StringFunctions.changeCharacter(after1, 1, '\0');
		}
		else
		{
		for (i = 0;i < 100;i++)
		{
			if (before < 1)
			{
				break;
			}
			else
			{
				tmp = before % n2;
				before = before / n2;
				if (tmp >= 10)
				{
				   strtmp = tmp + 55;
				}
				else
				{
				   strtmp = tmp + 48;
				}
				after = tangible.StringFunctions.changeCharacter(after, i, strtmp);
			}
		}
		after = tangible.StringFunctions.changeCharacter(after, i, '\0');
		//puts (after);
		m = after.length();
		//printf ("%d\n",m);
		for (i = 0;i < m;i++)
		{
			 after1 = tangible.StringFunctions.changeCharacter(after1, i, after.charAt(m - i - 1));
		}
		after1 = tangible.StringFunctions.changeCharacter(after1, i, '\0');
		}
		System.out.println(after1);
	}
}

