package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int l;
		int i;
		int j;
		int k = 0;
		int r;
		int tp;
		String s = new String(new char[2000]);
		String temp = new String(new char[2000]);
		s = new Scanner(System.in).nextLine();
		temp = s;
		l = temp.length();
		for (i = 0;i < l;i++)
		{

			if ((temp.charAt(i) == ',') || (i == l - 1))
			{
				a[k] = Integer.parseInt(temp);
				k++;
				n = k;
				for (j = 0;j < l - i - 1;j++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, j, temp.charAt(i + j + 1));
				}
				temp = tangible.StringFunctions.changeCharacter(temp, l - i - 1, '\0');
				l = temp.length();
				i = -1;
			}
		} //???n???

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] < a[j + 1])
				{
					tp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tp;
				}
			}
		}
		//????,????

		if (n == 1 || a[0] == a[n - 1])
		{
			System.out.print("No\n");
		}
		else
		{
			for (r = 0;r < n;r++)
			{
				if (a[r] != a[0])
				{
					System.out.printf("%d\n",a[r]);
					break;
				}
			}
		}
		//????
	}












}

