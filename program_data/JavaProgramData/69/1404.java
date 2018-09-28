package <missing>;

public class GlobalMembers
{
	public static int change(tangible.RefObject<String> s, int[] a)
	{
	  int l = s.argValue.length();
	  int i;
	  int j;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
	  for (i = 1;i <= (l>>3);i++)
	  {
		int tmp = 0;
		for (j = l - (i << 3);j < l - ((i - 1) << 3);j++)
		{
		  tmp = tmp * 10 + s.argValue.charAt(j) - 48;
		}
		a[i] = tmp;
	  }
	  a[0] = i - 1;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
	  if ((l >> 3 << 3) != l)
	  {
		a[0]++;
		int tmp = 0;
		for (j = 0;j < (l & 7);j++)
		{
		  tmp = tmp * 10 + s.argValue.charAt(j) - 48;
		}
		a[i] = tmp;
	  }
	  while (!a[a[0]] && (a[0] > 1))
	  {
		a[0]--;
	  }
	}
	public static int max(int a,int b)
	{
	  return ((a > b)?a:b);
	}
	public static int add(int[] a, int[] b)
	{
	  int i;
	  for (i = 1;i <= max(a[0], b[0]);i++)
	  {
		a[i] += b[i];
	  }
	  for (i = 1;i <= max(a[0], b[0]);i++)
	  {
		if (a[i] >= 100000000)
		{
		  a[i + 1] += a[i] / 100000000;
		  a[i] %= 100000000;
		}
	  }
	  a[0] = max(a[0], b[0]);
	  if (a[i])
	  {
		  a[0]++;
	  }
	}
	public static int Main()
	{
	  String s1 = new String(new char[300]);
	  String s2 = new String(new char[300]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s2 = tempVar2.charAt(0);
	  }
	  int[] a = new int[35];
	  int[] b = new int[35];
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(b,0,(Integer.SIZE / Byte.SIZE));
  tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
	  change(tempRef_s1, a);
	  s1 = tempRef_s1.argValue;
  tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
	  change(tempRef_s2, b);
	  s2 = tempRef_s2.argValue;
	  add(a, b);
	  System.out.printf("%d",a[a[0]]);
	  for (i = a[0] - 1;i != 0;i--)
	  {
		if (a[i] >= 10000000)
		{
			System.out.printf("%d",a[i]);
		}
		else if (a[i] >= 1000000)
		{
			System.out.printf("0%d",a[i]);
		}
		else if (a[i] >= 100000)
		{
			System.out.printf("00%d",a[i]);
		}
		else if (a[i] >= 10000)
		{
			System.out.printf("000%d",a[i]);
		}
		else if (a[i] >= 1000)
		{
			System.out.printf("0000%d",a[i]);
		}
		else if (a[i] >= 100)
		{
			System.out.printf("00000%d",a[i]);
		}
		else if (a[i] >= 10)
		{
			System.out.printf("000000%d",a[i]);
		}
		else
		{
			System.out.printf("0000000%d",a[i]);
		}
	  }
	}

}

