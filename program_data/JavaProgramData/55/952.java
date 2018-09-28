package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int l;
		 int i;
		 int m;
		 int j;
		 int s;
		 String n = new String(new char[100]);
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
		 l = n.length();
		 for (i = 0;i <= l - 1;i++)
		 {
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
			   n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
			}
			else if (n.charAt(i) >= 'a')
			{
			   n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
			}
			else
			{
			   n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
			}
		 }
		 s = 0;
		 for (i = l - 1;i >= 0;i--)
		 {
			m = n.charAt(i);
			for (j = 0;j < l - i - 1;j++)
			{
			   m *= a;
			}
			s += m;
		 }
		 i = 0;
		 int[] x = new int[100];
		 int[] y = new int[100];
		 for (s = s;s >= b;s = s / b)
		 {
			x[i] = s % b;
			i++;
		 }
		 x[i] = s;
		 for (j = 0;j <= i;j++)
		 {
			y[j] = x[i - j];
		 }
		 for (j = 0;j <= i;j++)
		 {
			if (y[j] <= 9 && y[j] >= 0)
			{
				n = tangible.StringFunctions.changeCharacter(n, j, y[j] + 48);
			}
			else
			{
			  n = tangible.StringFunctions.changeCharacter(n, j, y[j] + 55);
			}
		 }
		 n = tangible.StringFunctions.changeCharacter(n, j, '\0');
		 System.out.println(n);
	}

}

