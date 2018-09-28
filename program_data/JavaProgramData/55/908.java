package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
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
		int[] c = new int[100];
		int[] e = new int[100];
		int d = 0; //n??????
		int i;
		int j;
		for (i = 0;i < 100 && n.charAt(i) != '\0';i++)
		{
		 if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		 {
		 c[i] = n.charAt(i) - 'a' + 10;
		 }
		 else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
		 {
		 c[i] = n.charAt(i) - 'A' + 10;
		 }
		 else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		 {
		 c[i] = n.charAt(i) - '0';
		 }
		 d = d * a + c[i];
		}
		if (d == 0)
		{
		System.out.printf("%d",d);
		}
		for (i = 0;i < 100 && d != 0;i++)
		{
		 e[i] = d % b;
		 d = d / b;
		}
		for (j = 0;j < i;j++)
		{
		if (e[i - j - 1] <= 9 && e[i - j - 1] >= 0)
		{
		n = tangible.StringFunctions.changeCharacter(n, j, e[i - j - 1] + '0');
		}
		else if (e[i - j - 1] >= 10)
		{
		n = tangible.StringFunctions.changeCharacter(n, j, e[i - j - 1] - 10 + 'A');
		}
		}
		n = tangible.StringFunctions.changeCharacter(n, i, '\0');
		System.out.println(n);
		System.in.read();
		 System.in.read();
		 System.in.read();
		System.in.read();








	}

}

