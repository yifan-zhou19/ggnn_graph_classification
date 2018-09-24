package <missing>;

public class GlobalMembers
{
	public static int Main() d
	{
		int x;
		int y;
		int z;
	}
	{
		public static d[] s = tangible.Arrays.initializeWithDefaultdInstances(10);
		public static int n;
		public static int i;
		public static int j;
		public static int k = 0;
		public static int d;
		public static int x;
		public static int y;
		public static int z;
		public static int[] b = new int[45];
		public static int[] c = new int[45];
		public static double[] a = new double[45];
		public static double temp;
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		scanf("%d",&n);
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		for (i = 0;i < n;i++)
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
			scanf("%d %d %d",&s[i].x,&s[i].y,&s[i].z);
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		for (i = 0;i < n;i++)
//C++ TO JAVA CONVERTER TODO TASK: The following method format was not recognized, possibly due to an unrecognized macro:
			for (j = i + 1;j < n;j++)
			{
				x = s[i].x - s[j].x;
				y = s[i].y - s[j].y;
				z = s[i].z - s[j].z;
				a[k] = (x * x + y * y + z * z);
				a[k] = Math.sqrt(a[k]);
				b[k] = i;
				c[k] = j;
				k++;
			}
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		for (i = 0;i < k;i++)
//C++ TO JAVA CONVERTER TODO TASK: The following method format was not recognized, possibly due to an unrecognized macro:
			for (j = i + 1;j < k;j++)
			{
				if ((a[i] < a[j]) || ((a[i] == a[j]) && (b[i]> b[j])) || ((a[i] == a[j]) && (c[i] > c[j])))
				{
				temp = a[j];
			 a[j] = a[i];
			 a[i] = temp;
			 temp = b[j];
			 b[j] = b[i];
			 b[i] = temp;
			 temp = c[j];
			 c[j] = c[i];
			 c[i] = temp;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		for (i = 0;i < k;i++)
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
			printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",s[b[i]].x,s[b[i]].y,s[b[i]].z,s[c[i]].x,s[c[i]].y,s[c[i]].z,a[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		scanf("%d",&d);
		public static return 0 ;
}
}

