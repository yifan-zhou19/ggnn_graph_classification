package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		char c;
		int i;
		int k = 0;
		int j;
		int len;
		int p;
		int q;
		int temp0;
		int temp1;
		int w;
		int[] a = new int[50];
		int[] b = new int[50];
		s = new Scanner(System.in).nextLine();
		c = s.charAt(0);
		len = s.length();
		for (p = 0;p < len / 2;p++) //?????????? ???????? ??len/2?
		{
			for (i = 0;i < len - 1;i++)
			{
				if (s.charAt(i) == ' ') //??????????
				{
					continue;
				}
				else
				{
					for (j = i + 1;j < len - 1;j++) //?????i??????????
					{
						if (s.charAt(j) != ' ')
						{
							break;
						}
					}
					if (s.charAt(i) == c && s.charAt(j) != c) //???i????????????????
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
						s = tangible.StringFunctions.changeCharacter(s, j, ' '); //???????? ???????? ?a?b
						a[k] = i;
						b[k] = j;
						k++;
					}
				}
			}
		}
		for (p = 0;p < k - 1;p++) //??????????
		{
			for (q = 0;q < k - p - 1;q++)
			{
				if (b[q] > b[q + 1])
				{
					temp0 = b[q];
					b[q] = b[q + 1];
					b[q + 1] = temp0;
					temp1 = a[q];
					a[q] = a[q + 1];
					a[q + 1] = temp1;
				}
			}
		}
		for (w = 0;w < k;w++)
		{
			System.out.printf("%d %d\n",a[w],b[w]);
		}
	}

}

