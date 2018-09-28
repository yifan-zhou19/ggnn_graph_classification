package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		void peidui(char a.charAt(),int n);
		int i = 1;
		a = tangible.StringFunctions.changeCharacter(a, 0, System.in.read());
		while ((a[i] = System.in.read()) != '\n')
		{
			i++; //?????
		}
		peidui(a, 0); //????????
		return 0; //????????
	} //????????????
	public static void peidui(String a, int n)
	{

		while (a[n].equals(a[0]) || a[n].equals(0))
		{
			n++;
		}
		int i;
		i = n; //????????????
		do
		{
			i--;
		}while (a[i].equals(0)); //???????????
		System.out.print(i);
		System.out.print(' ');
		System.out.print(n);
		System.out.print("\n");
		a[n] = null;
		a[i] = null;
		if (i != 0)
		{
			peidui(a, n + 1);
		}
	}
}

