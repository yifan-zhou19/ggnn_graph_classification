package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String word = new String(new char[10000]);
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tangible.StringFunctions.changeCharacter(word, i, tempVar2);
			}
			i = word.length();
			word = tangible.StringFunctions.changeCharacter(word, i, ' ');
			j = j + 1;
			i = i + 1;
		} while (j < n);
		i = 80;
		j = 0;
		do
		{
			k = i;
			do
			{
				if (word.charAt(k) == ' ')
				{
					a[j] = k;
					break;
				}
				k = k - 1;
			} while (k > i - 80);
			i = k + 81;
			j = j + 1;
		} while (word.charAt(i) != 0);
		i = 0;
		j = 0;
		do
		{
			if (i == a[j])
			{
				System.out.print("\n");
				j = j + 1;
			}
			else
			{
				System.out.printf("%c",word.charAt(i));
			}
			i = i + 1;
		} while (word.charAt(i + 1) != 0);
	}






}

