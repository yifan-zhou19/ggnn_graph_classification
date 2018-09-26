package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		int i;
		int j = 0;
		int[] ten = new int[100];
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			j++;
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				ten[i] = n.charAt(i) - 48;
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				ten[i] = n.charAt(i) - 55;
			}
			else
			{
				ten[i] = n.charAt(i) - 87;
			}
		}
		int[] te = new int[100];
		te[0] = 1;
		for (i = 0;i < j;i++)
		{
			te[i + 1] = te[i] * a;
		}
		int t = 0;
		for (i = 0;i < j;i++)
		{
			t += te[i] * ten[j - i - 1];
		}
		String m = new String(new char[100]);
		int[] ben = new int[100];
		j = 0;
		if (t == 0)
		{
			System.out.print("0\n");
		}
		else
		{
		for (i = 0;t != 0;i++)
		{
			j++;
			ben[i] = t % b;
			t = t / b;
		}
		for (i = 0;i < j;i++)
		{
			if (ben[j - i - 1] >= 0 && ben[j - 1 - i] <= 9)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, ben[j - 1 - i] + 48);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, ben[j - 1 - i] + 55);
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",m.charAt(i));
		}
		System.out.print("\n");
		}
	}
}

