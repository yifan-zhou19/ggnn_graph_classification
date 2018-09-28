import java.util.*;

public class ren
{
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static ren[] a = tangible.Arrays.initializeWithDefaultrenInstances(3000);
	public static int judge(ren a, int t)
	{
		if (t < a.y && t >= a.x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String line1 = new String(new char[200000]);
		String line2 = new String(new char[200000]);
		String b = new String(new char[100]);
		int i;
		int j;
		int p = 0;
		int num = 0;
		int[] count = new int[1100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(line1,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(line2,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
		line1 = new Scanner(System.in).nextLine();
		line2 = new Scanner(System.in).nextLine();

		int len1;
		int len2;
		len1 = line1.length();
		len2 = line2.length();
		int sum = 1;
		for (i = 0;i < len1;i++)
		{
			if (line1.charAt(i) == ',')
			{
				sum++;
			}
		}

		for (i = 0;i < len1;i++)
		{
			if (line1.charAt(i) != ',')
			{
			   b = tangible.StringFunctions.changeCharacter(b, p, line1.charAt(i));
			   p++;
			}
			else
			{
				a[num].x = Integer.parseInt(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Character.SIZE / Byte.SIZE));
				p = 0;
				num++;
			}
		}
		a[num].x = Integer.parseInt(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
		p = 0;
		num = 0;
		for (i = 0;i < len2;i++)
		{
			if (line2.charAt(i) != ',')
			{
			   b = tangible.StringFunctions.changeCharacter(b, p, line2.charAt(i));
			   p++;
			}
			else
			{
				a[num].y = Integer.parseInt(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Character.SIZE / Byte.SIZE));
				p = 0;
				num++;
			}
		}
		a[num].y = Integer.parseInt(b);
		for (i = 0;i <= 1001;i++)
		{
			for (j = 0;j < sum;j++)
			{
				if (judge(a[j], i) != 0)
				{
					count[i]++;
				}
			}
		}
		int max = 0;
		for (i = 0;i < 1002;i++)
		{
			if (max < count[i])
			{
				max = count[i];
			}
		}
		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

