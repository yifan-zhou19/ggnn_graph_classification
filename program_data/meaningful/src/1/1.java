   for (int i=0; i<n-1; i++) {
      for (int j=i+1; j<n; j++) {
          if (data[i] > data[j]) {
             int tmp = data[i];
             data[i] = data[j];
             data[j] = tmp;
          }
      }
   }
