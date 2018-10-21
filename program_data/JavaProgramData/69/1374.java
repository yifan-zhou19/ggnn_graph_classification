import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		int[] a1 = new int[301];
		int[] a2 = new int[301];
		int[] a3 = new int[301];
	  String s1 = new String(new char[253]);
	  String s2 = new String(new char[253]);
	  s1 = new Scanner(System.in).nextLine();
	  s2 = new Scanner(System.in).nextLine();
	  l1 = s1.length();
	  l2 = s2.length();
	  j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(a3,0,(Integer.SIZE / Byte.SIZE));
	  for (i = l1 - 1;i >= 0;i--)
	  {
		  a1[j++] = s1.charAt(i) - '0';
	  }
	   j = 0;
	  for (i = l2 - 1;i >= 0;i--)
	  {
		  a2[j++] = s2.charAt(i) - '0';
	  }
	  for (i = 0;i < 299;i++)
	  {
		  a3[i] += a1[i] + a2[i];
	  if (a3[i] >= 10)
	  {
		  a3[i + 1]++;
		a3[i] -= 10;
	  }
	  }
	  i = 299;
	  while (a3[i] == 0 && i > 0)
	  {
		  i--;
	  }
	  for (;i >= 0;i--)
	  {
		  System.out.print(a3[i]);
	  }


	return 0;
	}
}
