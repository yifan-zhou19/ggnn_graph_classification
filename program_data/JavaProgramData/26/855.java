import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = null; //??????
		String a = new String(new char[101]);
		int[] c = new int[101];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE)); //???????

		a = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
		for (i = 0;i <= 100;i++)
		{
			if (a.charAt(i) != '\0')
			{
				n++;
			}
		else
		{
			break;
		}
		}

		p = a.charAt(0);
		   for (i = 0; * (p.Substring(i)) != '\0';i++) //??????????
		   {
			 if (*(p.Substring(i)) != 32 || (*(p.Substring(i)) == 32 && *(p.Substring(i) + 1) != 32))
			 {
				 c[i] = 1;
			 }
		   }

		for (i = 0;i <= n - 1;i++)
		{
			if (c[i] != 0)
			{
				System.out.print(a.charAt(i));
			}
		}
			System.out.print("\n");
		return 0;
	}
}
