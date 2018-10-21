import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,0,(Character.SIZE / Byte.SIZE));
	   while (cin.getline(str,15,' '))
	   {
			  substr = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String max = str;

		for (p = str; * p != 0;)
		{
						if (*p > max)
						{
							max = p;
						}
						p++;
		}
		p = str;
		do
		{
						System.out.print(p);
						if (p == max)
						{
							System.out.print(substr);
						}
						p++;
		}while (*p != 0);

		System.out.print("\n");


		if (c == 0)
		{
			break;
		}
		else
		{
			c = str.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(str,0,(Character.SIZE / Byte.SIZE));
	   }
		return 0;

	}

}
