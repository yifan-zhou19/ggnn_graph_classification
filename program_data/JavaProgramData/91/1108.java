package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		String qin = new String(new char[100]);
		int n;
		int[] ascii = new int[100];
		int i;
		int a;
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();

		for (i = 0;i < n;i++)
		{
			ascii[i] = zfc.charAt(i);
		}

		a = ascii[0] + ascii[n - 1];

		for (i = 0;i < n - 1;i++)
		{
			ascii[i] = ascii[i] + ascii[i + 1];
		}

		ascii[n - 1] = a;

		for (i = 0;i < n;i++)
		{
			qin = tangible.StringFunctions.changeCharacter(qin, i, ascii[i]);
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",qin.charAt(i));
		}
		return 0;
	}



}

