import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		//?????
		System.out.print("\n");
		int len;
		len = a.length(); //?????????
		int[] G = new int[50];
		int k = 0;
		char b = a.charAt(0);
		for (int i = 0;i < len;i++)
		{ //???????????????
		   if (a.charAt(i) != b)
		   {
			   G[k++] = i;
		   }
		}
		for (int i = 0;i < k;i++)
		{
			for (int j = G[i] - 1;j >= 0;j--)
			{
			   if (a.charAt(j) == b)
			   { //??????????????????????????
				   System.out.print(j);
				   System.out.print(" ");
				   System.out.print(G[i]);
				   System.out.print("\n");
				   a = tangible.StringFunctions.changeCharacter(a, G[i], '\0'); //??????????????????
				   a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				   break;
			   }
			}
		}
		return 0;
	}


}

