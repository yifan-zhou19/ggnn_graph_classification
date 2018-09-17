import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1002]);
		char t;
		int i;
		int j = 0;
		int k;
		int[] num = new int[1002];
		int[] m = new int[1002];

		for (i = 0; i <= 1000; i++)
		{
		num[i] = 1;
		}

		a = new Scanner(System.in).nextLine();

		m[0] = 0;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			  if ((a.charAt(i) == a.charAt(i + 1)) || (Math.abs(a.charAt(i) - a.charAt(i + 1)) == 32))
			  {
					  num[j]++;
					  m[j] = i;
			  }
			  else
			  {
				  m[j] = i;
				  j++;
			  }
		}

		for (i = 0; i < j; i++)
		{
			  if ((a.charAt(m[i]) >= 'a') && (a.charAt(m[i]) <= 'z'))
			  {
						 t = a.charAt(m[i]) - 32;
						 System.out.print("(");
						 System.out.print(t);
						 System.out.print(",");
						 System.out.print(num[i]);
						 System.out.print(")");
			  }
			  else
			  {
				  t = a.charAt(m[i]);
				  System.out.print("(");
				  System.out.print(t);
				  System.out.print(",");
				  System.out.print(num[i]);
				  System.out.print(")");
			  }
		}

		return 0;
	}


}
