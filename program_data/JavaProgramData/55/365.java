package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int[] m = new int[100];
		int j = 0;
		int p = 0;
		int k = 0;
		int[] q = new int[100];
		String n = new String(new char[100]);
		String w = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= 99;i++)
		{

		   if ('A' <= n.charAt(i) && 'Z' >= n.charAt(i))
		   {
			   m[i] = n.charAt(i) - 55;
		   }
		   else if ('a' <= n.charAt(i) && 'z' >= n.charAt(i))
		   {
			   m[i] = n.charAt(i) - 87;
		   }
		   else if ('0' <= n.charAt(i) && '9' >= n.charAt(i))
		   {
			   m[i] = n.charAt(i) - 48;
		   }
		}
		for (i = 0;i <= 99;i++)
		{
			if (n.charAt(i) != '\0')
			{
				j++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= j - 1;i++)
		{
		p = p + m[i] * Math.pow(a,j - i - 1);
		}
		for (i = 0;i <= 99;i++)
		{
			q[i] = p % b;
			if (q[i] >= 10)
			{
				w = tangible.StringFunctions.changeCharacter(w, i, q[i] + 55);
			}
			else
			{
				w = tangible.StringFunctions.changeCharacter(w, i, q[i] + 48);
			}
			p = p / b;
			k++;
			if (p == 0)
			{
				break;
			}
		}
		for (i = 1;i <= k;i++)
		{
		System.out.printf("%c",w.charAt(k - i));
		}
	}


}

