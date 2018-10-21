package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		char temp;
		int k = 0;
		int[] c = new int[300];
		int semp;
		int i;
		int j;
		int l;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				break;
			}
			else if (a.charAt(i + 1) == '\0')
			{
				System.out.print("No");
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				for (j = i + 1;a.charAt(j) != '\0';j++)
				{

				 if (a.charAt(i) == a.charAt(j))
				 {
					 a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					 c[k] = c[k] + 1;
				 }

				}
				k = k + 1;
			}
		}

		   for (i = 0;i < k;i++)
		   {
				l = i;
				for (j = i;j < k;j++)
				{
					if (b.charAt(j) < b.charAt(l))
					{
						l = j;
					}
				}
				if (i != l)
				{
					temp = b.charAt(i);
				 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(l));
				 b = tangible.StringFunctions.changeCharacter(b, l, temp);
				 semp = c[i];
				 c[i] = c[l];
				 c[l] = semp;
				}
		   }
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c=%d\n",b.charAt(i),c[i] + 1);
			}




	}


}

