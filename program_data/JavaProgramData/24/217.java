package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		final String b = "";
		int[] l = new int[100];
		int i = 0;
		int min = 0;
		int max = 0;
		int j;

		do
		{
			for (j = 0;j < 100;j++)
			{
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}

			l[i] = a.length();


			for (j = 0;j < l[i];j++)
			{
			b.charAt(i)[j] = a.charAt(j);
			}

			i++;
		} while (System.in.read() != '\n');

	for (j = 0;j < i;j++)
	{
		max = (l[max] >= l[j])?max:j;
		min = (l[min] <= l[j])?min:j;
	}



	for (i = 0;i < l[max];i++)
	{
	System.out.printf("%c",b.charAt(max)[i]);
	}

	System.out.print("\n");

	for (i = 0;i < l[min];i++)
	{
	System.out.printf("%c",b.charAt(min)[i]);
	}


	}

}

