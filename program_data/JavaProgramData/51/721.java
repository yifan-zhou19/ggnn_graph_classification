/**
 * IC::Final 2012-01-04
 * By Lu Junshi (1000010158)
 * <lujunshi@pku.edu.cn>
 * On 162.105.66.47
 */


public class ngram
{
	public String str = new String(new char[10]);
	public int count;
}

package <missing>;

public class GlobalMembers
{
	/*bss*/
	public static String input = new String(new char[555]);
	public static int cc = 0;
	public static ngram[] array = tangible.Arrays.initializeWithDefaultngramInstances(555);

	public static int cmp_sort(Object a, Object b)
	{
		ngram pa = (ngram)a;
		ngram pb = (ngram)b;
		int k = pb.count - pa.count;
		if (k != 0)
		{
			return k;
		}
		return a - b; //input order
	}

	public static int Main()
	{
		int n;
		int i;
		int len = 0;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		input = new Scanner(System.in).nextLine();
		p = input = new Scanner(System.in).nextLine();
		len = input.length();
		while (p - input <= len - n)
		{
			str = p.substring(0, n);
			str = str.substring(0, n);
			for (i = 0; i < cc; i++)
			{
				if (!(strcmp(array[i].str, str)))
				{
					array[i].count++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto found;
				}
			}
			array[cc].str = str;
			array[cc++].count = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			found:
			p++;
			continue;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(array, cc, sizeof(ngram), cmp_sort);
		max = array[0].count;
		if (max > 1)
		{
			System.out.printf("%d\n%s\n", max, array[0].str);
			for (i = 1; i < cc; i++)
			{
				if (array[i].count == max)
				{
					System.out.println(array[i].str);
				}
			}
		}
		else
		{
			System.out.println("NO");
		}
		return 0;
	}

}

