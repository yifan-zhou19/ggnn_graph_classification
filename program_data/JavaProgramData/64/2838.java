public class dian
{
public float x;
public float y;
public float z;
}
public class diandui
{
public dian a = new dian();
public dian b = new dian();
public float dis;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int t = 0;
	   dian[] d = tangible.Arrays.initializeWithDefaultdianInstances(10);
	   diandui[] dui = tangible.Arrays.initializeWithDefaultdianduiInstances(50);
	   diandui temp = new diandui();
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   d[i].x = Float.parseFloat(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   d[i].y = Float.parseFloat(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   d[i].z = Float.parseFloat(tempVar4);
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
			for (j = i + 1;j < n;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dui[t].a=d[i];
				dui[t].a.copyFrom(d[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dui[t].b=d[j];
				dui[t].b.copyFrom(d[j]);
				//printf("%f %f",d[i].x,d[j].x);
				dui[t].dis = Math.sqrt((d[i].x - d[j].x) * (d[i].x - d[j].x) + (d[i].y - d[j].y) * (d[i].y - d[j].y) + (d[i].z - d[j].z) * (d[i].z - d[j].z));
				//printf("%.2f\n",dui[t].dis);
				t++;
			}
	   }
	   for (i = 0;i < t;i++)
	   {
			for (j = 0;j < t - 1 - i;j++)
			{
				if (dui[j].dis < dui[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dui[j];
					temp.copyFrom(dui[j]);
					dui[j] = dui[j + 1];
					dui[j + 1] = temp;
				}
			}
	   }
	   for (i = 0;i < t;i++)
	   {
			System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",dui[i].a.x,dui[i].a.y,dui[i].a.z,dui[i].b.x,dui[i].b.y,dui[i].b.z,dui[i].dis);
	   }
	}

}

