import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String bra = new String(new char[100]);
		void together(char bra.charAt(100));

		bra = new Scanner(System.in).nextLine();
		together(bra);

		return 0;
	}

	public static void together(String bra)
	{
		int len;
		char ch; //ch stores the character of boy
		ch = bra[0];
		int k = 0; //s flags the match case of boy and girl
		int i;
		int j;
		int s;
		int[][] bg = new int[50][2];
		len = bra.length();
		for (i = 1;i < len;i++) //bra[0] can't be ')'
		{
			if (!bra[i].equals(ch)) //for a certain girl,find the boy next to her(loop to left)
			{
				s = 1;
				for (j = i - 1;j >= 0;j--)
				{
					if (!bra[j].equals(ch))
					{
						s++;
					}
					else
					{
						s--;
					}
					if (s == 0) //if find , s should be 0;
					{
						bg[k][0] = j; //bg[k][0] is the boy,while bg[k][1] is the girl
						bg[k][1] = i;
						k++;
						break;
					}
				}
			}
		}
		for (i = 0;i < k;i++) //print the result
		{
			System.out.print(bg[i][0]);
			System.out.print(" ");
			System.out.print(bg[i][1]);
			System.out.print("\n");
		}
	}
}
