package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int j;
		int p;
		int q;
		int t = 1;
		int s = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
			c[i] = a.charAt(i) - '0';
			}
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			c[i] = a.charAt(i) - 'a' + 10;
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
			c[i] = a.charAt(i) - 'A' + 10;
			}
		}
		p = i;
		for (i = p - 1;i >= 0;i--)
		{
			 s = s + t * c[i];
			 t = t * m;
		}
		if (s == 0)
		{
		System.out.print("0");
		}
		else
		{
			 for (i = 0;s != 0;i++)
			 {
			d[i] = s % n;
			s = s / n;
			 }
	   q = i;
		 for (i = 0;i < q;i++)
		 {
			if (d[i] >= 0 && d[i] <= 9)
			{
			b = tangible.StringFunctions.changeCharacter(b, i, d[i] + '0');
			}
			else
			{
			b = tangible.StringFunctions.changeCharacter(b, i, d[i] + 'A' - 10);
			}
		 }
		 for (i = q - 1;i >= 0;i--)
		 {
		 System.out.printf("%c",b.charAt(i));
		 }
		}
		 System.out.print("\n");
		 System.in.read();
		 System.in.read();
	}


}

