package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int n;
		int b;
		String s = new String(new char[100]);
		final String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
			   c[i] = s.charAt(i) - 'a' + 10;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
			   c[i] = s.charAt(i) - 'A' + 10;
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
			   c[i] = s.charAt(i) - '0';
			}
		}
		int k = 0;
		for (i = 0;i < n;i++)
		{
			k = k * a;
			k += c[i];
		}
		j = 0;
		if (k == 0)
		{
		System.out.print("0");
		}
		else
		{
		  while (k != 0)
		  {
			s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(k % b));
			k = k / b;
			j++;
		  }
		}
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}
}

