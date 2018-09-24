package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[1001]);
		int[] a = new int[1001];
		int i;
		int j;
		for (i = 0;i <= 1000;i++)
		{
			a[i] = 1;
		}
		w = new Scanner(System.in).nextLine();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (w.charAt(i) >= 96)
			{
				w = tangible.StringFunctions.changeCharacter(w, i, w.charAt(i) - 32);
			}
		}
		for (i = 1,j = 1;;i++)
		{
			if (w.charAt(i - 1) == '\0')
			{
				break;
			}
			if (w.charAt(i) == w.charAt(i - 1))
			{
				a[j] = a[j] + 1;
			}
			else
			{
				System.out.printf("(%c,%d)",w.charAt(i - 1),a[j]);
				j = j + 1;
			}
		}
		System.out.print("\n");
		return 0;
	}


}

