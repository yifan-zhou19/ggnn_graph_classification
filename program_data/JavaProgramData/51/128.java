public class gram
{
  public String ch = new String(new char[10]);
  public int ord;
  public int times;
  public int sign;
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	  gram pa;
	  gram pb;
	  pa = (gram)a;
	  pb = (gram)b;
	  if (pa.times != pb.times)
	  {
		  return ((pa.times < pb.times))?1:-1;
	  }
	  //if(strcmp(pa->ch,pb->ch))return (strcmp(pa->ch,pb->ch)>0)?1:-1;
	  return ((pa.ord) > (pb.ord))?1:-1;
	}
	public static int Main()
	{
	  String c = new String(new char[1000]);
	  gram[] d = tangible.Arrays.initializeWithDefaultgramInstances(1000);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  p = c;
	  for (i = 0;i < c.length() + 1 - n;i++)
	  {
		d[i].ord = i;
		d[i].sign = 1;
		for (j = 0;j < n;j++)
		{
		d[i].ch = tangible.StringFunctions.changeCharacter(d[i].ch, j, *(p + j));
		}
		d[i].ch = tangible.StringFunctions.changeCharacter(d[i].ch, n, '\0');
		p++;
	  }
	  for (i = 0;i < c.length() + 1 - n;i++)
	  {
		k = 1;
		for (j = 0;j < c.length() + 1 - n;j++)
		{
		if (i != j && strcmp(d[i].ch,d[j].ch) == 0)
		{
			k++;
		}
		}
		d[i].times = k;
	  }
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  qsort(d,c.length() + 1 - n,sizeof(d[0]),cmp);
	  int m = d[0].times;
	  if (m == 1)
	  {
		  System.out.print("NO");
		  return 0;
	  }
	  System.out.printf("%d\n",m);
	  for (i = 0;i < c.length() + 1 - n;i++)
	  {
	  if (d[i].times == m && d[i].sign != 0)
	  {
		System.out.printf("%s\n",d[i].ch);
		for (j = 0;j < c.length() + 1 - n;j++)
		{
		if (i != j && strcmp(d[i].ch,d[j].ch) == 0)
		{
			d[j].sign = 0;
		}
		}
	  }
	  }
	  return 0;
	}
}

