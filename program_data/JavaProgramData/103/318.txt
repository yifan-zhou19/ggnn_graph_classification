import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int k;

		int i;
		int j;

		int count = 1;

		String me = new String(new char[1001]);
		int[] mem = new int[1001];

		String s = new String(new char[1001]);
		s = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(mem,0,(Integer.SIZE / Byte.SIZE));

		j = 1;
		me = tangible.StringFunctions.changeCharacter(me, 1, s.charAt(0));



		for (i = 0;s.charAt(i) != 0;i++)
		{

			if (s.charAt(i) == me.charAt(j) || s.charAt(i) - 'a' == me.charAt(j) - 'A' || s.charAt(i) - 'A' == me.charAt(j) - 'a')
			{
				mem[j]++;
			}
			else
			{
				j++;
			me = tangible.StringFunctions.changeCharacter(me, j, s.charAt(i));
			mem[j]++;
			count++;
			}
		}

		for (i = 1;i <= count;i++)
		{
			if (me.charAt(i) >= 'a' && me.charAt(i) <= 'z')
			{
				me = tangible.StringFunctions.changeCharacter(me, i, me.charAt(i) - 'a'+'A');
			}
		}


		for (i = 1;i <= count;i++)
		{
			System.out.print("(");
			System.out.print(me.charAt(i));
			System.out.print(",");
			System.out.print(mem[i]);
			System.out.print(")");
		}













		return 0;
	}
}

