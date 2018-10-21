import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n; //n???,i,j?????,l??????,sign??????
	 int i;
	 int j;
	 int l;
	 int sign;
	 String str = new String(new char[81]); //str??????
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.in.read();
	 for (i = 1;i <= n;i++)
	 {
	   sign = 1; //???????1
	   for (j = 0;j < 81;j++)
	   {
		str = tangible.StringFunctions.changeCharacter(str, j, '\0'); //?????
	   }
	   str = new Scanner(System.in).nextLine(); //?????
	   l = 0;
	   while (str.charAt(l) != '\0')
	   {
		l++; //???????
	   }
	   if (str.charAt(0) < 'A' || (str.charAt(0)>'Z' && str.charAt(0) < '_') || (str.charAt(0)>'_' && str.charAt(0) < 'a') || str.charAt(0)>'z')
	   {
		sign = 0; //?????
	   }
	   for (j = 1;j < l;j++)
	   {
		if (str.charAt(j) < '0' || (str.charAt(j)>'9' && str.charAt(j) < 'A') || (str.charAt(j)>'Z' && str.charAt(j) < '_') || (str.charAt(j)>'_' && str.charAt(j) < 'a') || str.charAt(j)>'z')
		{
		 sign = 0; //???????????
		}
	   }
	   System.out.print(sign);
	   System.out.print("\n");
	 }
	 return 0;
	}
}

