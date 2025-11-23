//
//  ContentView.swift
//  KmpTestIOS
//
//  Created by washida on 2025/11/23.
//

import SwiftUI
import KmpTestCommon

struct ContentView: View {
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text(KmpTestCommon.PlatformKt.hello())
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
