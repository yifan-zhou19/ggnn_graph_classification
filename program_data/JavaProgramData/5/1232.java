package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int i;
			int x;
			int y;
			double n;
			double count = 0.00;
			String a = new String(new char[501]);
			String b = new String(new char[501]);


			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Double.parseDouble(tempVar);
			}
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();

					x = a.length();
					y = b.length();
					if (x != y)
					{
							System.out.print("error");
							return 0;

					}

			for (i = 0; a.charAt(i) != '\0',b.charAt(i) != '\0'; i++)
			{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
							System.out.print("error");
							return 0;
							break;
			}


					if (a.charAt(i) == b.charAt(i))
					{
							count++;
					}
			}


					if (count / (x - 1) >= n)
					{
							System.out.print("yes");
					}
					else
					{
							System.out.print("no");
					}

			return 0;
	}
}

